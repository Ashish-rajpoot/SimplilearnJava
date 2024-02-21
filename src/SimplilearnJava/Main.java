package SimplilearnJava;

    import java.util.*;
    import java.util.stream.Collectors;


    class Player {
        private String name;
        private int weight;

        public Player(String name, int weight) {
            this.name = name;
            this.weight = weight;
        }

        public Player(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public int getWeight() {
            return weight;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setWeight(int weight) {
            this.weight = weight;
        }

        @Override
        public String toString() {
            return "Name: " + name + ", Weight: " + weight;
        }
    }

    class PlayerGrouping {
        public List<String> threeHighWeighedPlayer(List<Player> players) {
            return players.stream()
                    .filter(player -> player.getWeight() > 200)
                    .limit(3)
                    .map(Player::getName)
                    .collect(Collectors.toList());
        }

        public List<Player> addPlayerToName(List<Player> list) {
            List<Player> result = new ArrayList<>();
            for (Player player : list) {
                String newName = "Player: " + player.getName();
                Player newPlayer = new Player(newName, player.getWeight());
                result.add(newPlayer);
            }
            return result;
        }

        // Getter and setter methods here (not explicitly specified in the task)
        // Define as needed based on requirements.
    }

    public class Main {
        public static void main(String[] args) {
            List<Player> players = Arrays.asList(new Player("Dean", 400), new Player("Sam", 150));
            PlayerGrouping pg = new PlayerGrouping();

            List<String> highWeightedPlayers = pg.threeHighWeighedPlayer(players);
            System.out.println("High Weighted Players: " + highWeightedPlayers);

            List<Player> playersWithModifiedNames = pg.addPlayerToName(players);
            System.out.println("Players with Modified Names: " + playersWithModifiedNames);
        }
    }

