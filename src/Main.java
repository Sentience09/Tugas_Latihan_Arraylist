public class Main {
    public static void main(String[] args) {
        Bank bankUnram = new Bank();

        bankUnram.addCustomer("Andre", "Sagos");
        bankUnram.addCustomer("Rahmat", "Dika");

        Customer nasabah1 = bankUnram.getCustomer(0);
        System.out.println("Nasabah: " + nasabah1.getFirstName() + " " + nasabah1.getLastName());

        Akun akunBudi = new Akun(500000); 
        nasabah1.setAkun(akunBudi);

        Akun akunAktif = nasabah1.getAkun(0);
        System.out.println("Saldo Awal: Rp " + akunAktif.getBalance());

        System.out.println("\nSetor tunai Rp 200.000...");
        akunAktif.deposit(200000);
        System.out.println("Saldo sekarang: Rp " + akunAktif.getBalance());

        System.out.println("\nTarik tunai Rp 100.000...");
        akunAktif.withdraw(100000);
        System.out.println("Saldo sekarang: Rp " + akunAktif.getBalance());
    }
}