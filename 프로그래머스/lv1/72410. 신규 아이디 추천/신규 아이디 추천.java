class Solution {
    public String solution(String new_id) {
        
        new_id = new_id.toLowerCase();

        new_id = new_id.replaceAll("[^a-z0-9-_.]", "");

        new_id = new_id.replaceAll("[.]+", ".");

        new_id = new_id.replaceAll("^[.]|[.]$", "");

        if (new_id.equals("")) {
            new_id = "a";
        }
    
        if (new_id.length() >= 16) {
            new_id = new_id.substring(0, 15);
            new_id = new_id.replaceAll("[.]$", "");
        }
        
        if (new_id.length() <= 2) {
            char add = new_id.charAt(new_id.length()-1);
            while (true) {
                new_id += add;
                if (new_id.length() == 3)
                    break;
            }

        }
        
        String answer = new_id;
        return answer;
    }
}
