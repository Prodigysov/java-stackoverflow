import java.lang.reflect.Field;

class C {
    public C thisObj = this;

    public static int fInt = 0;

    public static void printVar(Object obj) throws Exception {
        Class<?> clz = obj.getClass();
        for (Field f : clz.getFields()) {
            Object fObj = f.get(obj);
            System.out.println(fObj);
            System.out.println(++fInt);
            // int[][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][] aaa = new int[fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt][fInt];
            printVar(fObj);
        }
    }

    public static void main(String[] args) throws Exception {
        C c = new C();
        printVar(c);
    }
}
