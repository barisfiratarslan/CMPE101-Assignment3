//interface of sortable
interface Sortable {
    public boolean isGreater(double number);//method which takes one double and returns boolean value
}//end of the interface

//class of video file and implement sortable
class VideoFile implements Sortable {
    private String name;//field of name which is name
    private double length;//field of length which is double
    private String resolution;//field of resolution which is string

    public static void sort(VideoFile[] videoFiles) {//method is to sort array of video file and it takes one parametre which is array of video files
        for (int i = 0; i < videoFiles.length; i++) {
            VideoFile vf = videoFiles[i];//to take data in array of index of i
            videoFiles[i] = videoFiles[findMin(videoFiles, i)];//to define minumum length in array to index of i
            videoFiles[findMin(videoFiles, i)] = vf;//to define taking data to index of finding minumum index
        }//end of for loop
    }//end of the method

    private static int findMin(VideoFile[] videoFiles, int startIndex) {//method is to find min value in array of video file which is beginnig restricted and returns index of minumum value of length
        int minIndex = startIndex; //value of taking starting index of array
        double min = videoFiles[startIndex].length; // value of length in taking starting index

        for (int i = startIndex; i < videoFiles.length; i++) {
            if (videoFiles[i].isGreater(min) == false) {//to find min which is bigger than value of length in array
                min = videoFiles[i].length;//if smaller, value of min describes value of length in array
                minIndex = i;//if smaller, value ofminIndex describes value of index of array
            }
        }//end of for loop
        return minIndex;
    }//end of the method

    @Override
    public boolean isGreater(double number) {//method is to compare value of length in video file and given value
        if (length > number) {//if value of length in shirt is bigger than given value return true
            return true;
        } else {//otherwise, return false
            return false;
        }
    }//end of the method 

    public VideoFile(String name, double length, String resolution) {//constructer of video file
        this.name = name;
        this.length = length;
        this.resolution = resolution;
    }//end of the constructer

    @Override
    public String toString() {//to write all data of field in class
        return "Name: " + name + " Length: " + length + " Resolution: " + resolution;
    }//end of the method

}//end of the class

//class of shirt and implement sortable
class Shirt implements Sortable {
    private String color;//field of color which is string
    private String size;//field of size which is string
    private double price;//field of price which is double

    public static void sort(Shirt[] shirts){//method is to sort array of video file and it takes one parametre which is array of shirts
        for (int i = 0; i < shirts.length; i++) {
            Shirt s=shirts[i];//to take data in array of index of i
            shirts[i]=shirts[findMinIndex(shirts, i)];//to define minumum length in array to index of i
            shirts[findMinIndex(shirts, i)]=s;//to define taking data to index of finding minumum index
        }//end of for loop
    }//end of the method

    private static int findMinIndex(Shirt[] shirts,int startIndex){//method is to find min value in array which is beginnig restricted and returns index of minumum value of price
        int minIndex=startIndex;
        double min=shirts[startIndex].price;
        for (int i = startIndex; i < shirts.length; i++) {
            if (shirts[i].isGreater(min) == false) {//to find min which is bigger than value of price in array
                min = shirts[i].price;//if smaller, value of min describes value of price in array
                minIndex = i;//if smaller, value of minIndex describes value of index of array
            }
        }//end of for loop
        return minIndex;
    }//end of the method

    @Override
    public boolean isGreater(double number) {//method is to compare value of price in shirt and given value
        if (price > number) {//if value of price in shirt is bigger than given value return true
            return true;
        } else {//otherwise, return false
            return false;
        }
    }//end of the method

    public Shirt(String color, String size, double price) {//constructer of shirt
        this.color = color;
        this.size = size;
        this.price = price;
    }//end of the constructer

    @Override
    public String toString() {//to write all data of field in class
        return "Color: " + color + " Price: " + price + " Size: " + size;
    }//end of the method
}//end of the class

//class of test
class Test{
    public static void main(String[] args) {
        //intances of video file
        VideoFile vf1=new VideoFile("AVATAR", 180, "144p");
        VideoFile vf2=new VideoFile("MAZE RUNNER", 69, "360p");
        VideoFile vf3=new VideoFile("GOTFATHER", 149, "480p");
        VideoFile vf4=new VideoFile("GAME of THRONES", 156, "720p");
        VideoFile vf5=new VideoFile("SHERLOCK HOLMES", 115, "360p");
        VideoFile[] vf={vf1,vf2,vf3,vf4,vf5};//array of video files
        System.out.println("Before sorting for video file array");
        for (int i = 0; i < vf.length; i++) {
            System.out.println(vf[i].toString());//to write all data before sorting
        }
        VideoFile.sort(vf);//sort array of video array
        System.out.println("After sorting for video file array");
        for (int i = 0; i < vf.length; i++) {
            System.out.println(vf[i].toString());//to write all data after sorting
        }
        //instances of shirt
        Shirt s1=new Shirt("RED", "M", 86);
        Shirt s2=new Shirt("YELLOW", "S", 26);
        Shirt s3=new Shirt("GREEN", "XL", 90);
        Shirt s4=new Shirt("BLUE", "XS", 58);
        Shirt s5=new Shirt("BLACK", "XXL", 55);
        Shirt[] s={s1,s2,s3,s4,s5};//array of shirts
        System.out.println("Before sorting for shirt array");
        for (int i = 0; i < vf.length; i++) {
            System.out.println(s[i].toString());//to write all data before sorting
        }
        Shirt.sort(s);//sort array of shirt
        System.out.println("After sorting for shirt array");
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i].toString());//to write all data after sorting
        }
    }//end of the main method
}//end of the test class