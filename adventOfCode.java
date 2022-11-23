public static adventOfCode {
    public static void main(String[] args) throws FileNotFoundException {

    try {

        BufferedReader br = new BufferedReader(new FileReader("inputs/inputsDayOne.txt"));
        int countIncrease = 0;
        int lastNum = -1;
        String line;
        while((line = br.readLine()) != null) {
                if(line.isBlank()) continue;
                int i = Integer.parseInt(line);
                if(lastNum == -1){
                    lastNum = i;
                    continue;
                }

                if (i > lastNum) {
                    countIncrease++;
                }
                lastNum = i;

            }
            System.out.println(countIncrease);
        } catch (IOException ex) {
        throw new RuntimeException(ex);
    }
    }

}
