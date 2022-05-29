
public class Main {
    public static void main(String[] args) {
        HashMap hashMap = new HashMap();
        String [] strings = {"Wer", "Aot","Ter","Yet","Zak","Das","Kol","Lok"};
        for (int i = 0; i < strings.length; i++) {
            hashMap.put(strings[i].hashCode(),strings[i]);
        }

        System.out.println(hashMap);
        System.out.println(hashMap.get(strings[2].hashCode()));
        hashMap.remove(strings[4].hashCode());

        System.out.println(hashMap);
        System.out.println(hashMap.get(strings[1].hashCode()));
        hashMap.put("Zak".hashCode(),"Pdk");
        System.out.println(hashMap);

    }
}