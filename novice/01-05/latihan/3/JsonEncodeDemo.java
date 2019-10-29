import org.json.simple.JSONObject;

class JsonEncodeDemo {
    
    public static Boolean valueOf(boolean b) {
        return (b ? TRUE : FALSE);
    } 

    public static Double valueOf(String s) throws NumberFormatException {
        return new Double(parseDouble(s));
    }

    

   public static void main(String[] args) {
      JSONObject obj = new JSONObject();
    
      
      obj.put("name", "foo");
      obj.put("num", valueOf(100));
      obj.put("balance", valueOf(1000.21));
      obj.put("is_vip", valueOf(true));

      System.out.print(obj);
   }
}
