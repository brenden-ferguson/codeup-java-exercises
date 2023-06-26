public class ServerNameGenerator {

    public static String randomName(){
        String[] adjectives = {
                "beautiful",
                "clever",
                "delightful",
                "elegant",
                "fierce",
                "graceful",
                "happy",
                "incredible",
                "joyful",
                "kind"
        };

        String[] nouns = {
                "cat",
                "dog",
                "flower",
                "mountain",
                "ocean",
                "sun",
                "tree",
                "river",
                "book",
                "song"
        };

        int randomNumber = (int) Math.floor(Math.random() * 10);
        int randomNumber2 = (int) Math.floor(Math.random() * 10);

        return adjectives[randomNumber] + " " + nouns[randomNumber2];
    }

    public static void main(String[] args) {
        System.out.println(randomName());
    }
}
