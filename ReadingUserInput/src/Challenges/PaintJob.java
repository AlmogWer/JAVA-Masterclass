package Challenges;

public class PaintJob {
    public static void main(String[] args) {

    }
    public static int getBucketCount(double width, double height,int areaPerBucket,int extraBuckets){
        if(width<=0||height<=0||areaPerBucket<=0||extraBuckets<0){
            return -1;
        }

    }
    public static int getBucketCount(double width, double height,int areaPerBucket){
        if(width<=0||height<=0||areaPerBucket<=0){
            return -1;
        }
    }

    public static int getBucketCount(double area,double areaPerBucket){
        if(area<=0||areaPerBucket<=0){
            return -1;
        }
    }
}
