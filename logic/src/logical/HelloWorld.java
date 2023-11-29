package logical;


import java.util.Hashtable;

class HelloWorld {
    static Hashtable<String, Long> averageMethodRunTimeHashtable = new Hashtable<>();
    static long topTime = 0l;
    public static void main(String[] args) {
        //boolean stopServer = false; //usually stopped by an external source
        //while (!stopServer){ //normally this runs "forever"
        for (int ii = 0; ii < 100; ii++){ //for this example just run 100 times
            topTime = System.nanoTime();
            localVariableMethod();
            averageMethodRunTime("localVariableMethod", (System.nanoTime() - topTime));
        
            topTime = System.nanoTime();
            globalVariableMethod();
            averageMethodRunTime("globalVariableMethod", (System.nanoTime() - topTime));
        }
        
        System.out.println("averageMethodRunTimeHashtable: " + averageMethodRunTimeHashtable);
    }
    
    public static void localVariableMethod(){
        for (int i = 0; i < 100; i++){
            int test = i;
        }
    }
    
    static int test_globalVariableMethod = 0;
    public static void globalVariableMethod(){
        for (int i = 0; i < 100; i++){
            test_globalVariableMethod = i;
        }
    }
    public static void averageMethodRunTime(String method, long time) {
        if (averageMethodRunTimeHashtable.containsKey(method)) {
            averageMethodRunTimeHashtable.put(method, (time + averageMethodRunTimeHashtable.get(method)) / 2);
        } else {
            averageMethodRunTimeHashtable.put(method, time);
        }
    }
}


