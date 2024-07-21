public class towerOfHanoi{
    public static void hanoiTower(int disk, String Source,String Helper,String Destination){
        if(disk == 1){
            System.out.println("Disk "+ disk + " "+ Source + " to " + Destination);
            return;

        }

        hanoiTower(disk-1, Source, Destination, Helper);
        System.out.println("Disk "+ disk + " " + Source + " to " + Destination);
        hanoiTower(disk-1, Helper, Source, Destination);
    }

    public static void main(String[] args) {
        int n = 5;
        hanoiTower(n, "S","H", "D");
    }

}