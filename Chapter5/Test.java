
/**
 * Write a description of class Test here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Test
{
    public static void main(String[] args)
    {
        PollDisplayPanel vm = new PollDisplayPanel("Tami", "Brian", "Liz");
        vm.vote1();
        vm.vote2();
        vm.vote3();
        System.out.println(vm);
    }
}
