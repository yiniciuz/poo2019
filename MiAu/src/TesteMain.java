public class TesteMain {
    public static void main (String [] args) {
        Passeio passeio = new Passeio("24 out", 17f, 2f);
        System.out.println(passeio);
        passeio.pagamento();
        System.out.println(passeio.pagamento());
    }
}