    public class Counter {
        String sentence = "The dog chased the dog and the dog ran away";

        public void frequency() {
            // Sentence ko lowercase me convert karke words ke array me split kar diya
            String[] words = sentence.toLowerCase().split(" ");

            // Har word ke liye loop
            for (int i = 0; i < words.length;  i++) {
                int count = 1;              // Word ka initial count 1 set
                boolean alreadyexist = false; // Check karne ke liye ki word pehle count hua ya nahi

                // Pehle check karo ki ye word already count ho chuka hai ya nahi
                for (int k = 0; k < i; k++) {
                    if (words[k].equals(words[i])) { // Agar same word pehle aa chuka ho
                        alreadyexist = true;        // Flag set
                        break;                      // Aur inner loop se bahar niklny kay liay

                    }
                }

                // Agar word pehle count nahi hua
                if (alreadyexist == false) {

                    // Array ke baaki words me count karo duplicates
                    for (int j = i + 1; j < words.length; j++) {
                        if (words[i].equals(words[j])) {
                            count++; // Duplicate milne par count increment karo
                        }
                    }

                    // Print the count of current word
                    if (alreadyexist == false) {
                        System.out.println("Count of " + words[i] + " = " + count);
                    }
                }
            }
        }
    }
