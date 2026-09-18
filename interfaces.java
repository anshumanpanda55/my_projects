interface bicycle {
    void speedup(int increement);
    void applybreak(int decreement);}

    interface hornbicycle {
        void blowhorn( String slow);
        void blowhorn2( String speed);}
        
        class avonbicycle implements bicycle, hornbicycle {
            public void speedup(int increement) {
                System.out.println("Speeding up by " + increement);
            }
            public void applybreak(int decreement) {
                System.out.println("Applying break by " + decreement);
            }
            public void blowhorn( String slow) {
                System.out.println("Blowing horn"  + slow);
            }
            public void blowhorn2( String speed) {
                System.out.println("Blowing horn"  + speed);}}


                public class interfaces extends avonbicycle {
                public static void main(String [] args){
                        avonbicycle obj = new avonbicycle();
                        obj.speedup(100);
                        obj.applybreak(20);
                        obj.blowhorn("pepe");
                        obj.blowhorn2("popopo");}}


                
                
            
        
    

