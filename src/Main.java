public class Main {

    public static void main(String[] args) {
        testObjectAdapter();
        testClassAdapter();
    }

    private static void testObjectAdapter() {
        SocketAdapter socketObjectAdapter = new SocketObjectAdapterObjectImpl();
        Volt volt3 = getVolt(socketObjectAdapter, 3);
        Volt volt12 = getVolt(socketObjectAdapter, 12);
        Volt volt120 = getVolt(socketObjectAdapter, 120);
        System.out.println(volt3.getVolts() + " Volts using object adapter");
        System.out.println(volt12.getVolts() + " Volts using object adapter");
        System.out.println((volt120.getVolts() + " Volts using object adapter"));
    }

    private static void testClassAdapter() {
        SocketAdapter socketClassAdapter = new SocketClassAdapterImpl();
        Volt volt3 = getVolt(socketClassAdapter, 3);
        Volt volt12 = getVolt(socketClassAdapter, 12);
        Volt volt120 = getVolt(socketClassAdapter, 120);
        System.out.println();
        System.out.println();
        System.out.println(volt3.getVolts() + " Volts using class adapter");
        System.out.println(volt12.getVolts() + " Volts using class adapter");
        System.out.println((volt120.getVolts() + " Volts using class adapter"));
    }

    private static Volt getVolt(SocketAdapter socketAdapter, int i) {
        switch (i) {
            case 3:
                return socketAdapter.get3Volt();
            case 12:
                return socketAdapter.get12Volt();
            default:
                return socketAdapter.get120Volt();
        }
    }
}
