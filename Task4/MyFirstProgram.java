class MySecondClass {
    private int a;
    private int b;
    public int getA() {
        return a;
    }
    public int getB() {
        return b;
    }
    public void setA(int a) {
        this.a = a;
    }
    public void setB(int b) {
        this.b = b;
    }
    public MySecondClass(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public int plus() {
        return a + b;
    }
}

class MyFirstClass {
    public static void main(String[] s) {
        MySecondClass o = new MySecondClass(0, 0);
        int i, j;
        for (i = 1; i <= 8; i++) {
            for (j = 1; j <= 8; j++) {
                o.setA(i);
                o.setB(j);
                System.out.print(o.plus());
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}
