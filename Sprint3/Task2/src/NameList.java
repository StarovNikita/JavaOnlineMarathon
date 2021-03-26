class NameList {
    private String[] names = {"Mike", "Emily", "Nick", "Patric", "Sara"};

    public Iterator getIterator() {
        return new Iterator();
    }

    // Write your code here
    public class Iterator{
        private int counter = 0;
        private Iterator(){

        }
        public boolean hasNext(){
            while (counter < names.length){
                if(names[counter]!=null){
                    return true;
                }
                else
                    counter++;
            }
            return false;
        }
        public String next(){
            String index = names[counter];
            counter++;
            return index;
        }
    }

}
