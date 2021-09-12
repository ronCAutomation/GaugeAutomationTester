import org.checkerframework.checker.units.UnitsTools;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class MyTestClass {

    static Path source = Paths.get("D:\\Work\\SampleDirectorySource\\JingName.txt");
    static Path destination = Paths.get("D:\\Work\\SampleDirectoryTarget");
    static Path renamedSource;

    public static Path renameFile(Path source)
    {
        try{
            System.out.println(String.valueOf(source));
            renamedSource = source.resolveSibling("MingName.txt");
            Files.move(source, renamedSource);

        } catch (IOException e) {
            e.printStackTrace();

        }

        return renamedSource;

    }

    public static void moveFileToOtherDirectory(Path source, Path destination) throws IOException
    {
        Files.createDirectories(destination);
        Files.move(source, destination.resolve(source.getFileName()), StandardCopyOption.REPLACE_EXISTING);
    }


    public static void main(String[] args) throws IOException {

    //    moveFileToOtherDirectory(renameFile(source), destination);
        System.out.println("Hello friend");
        System.out.println("Perfect");
        System.out.println("Dobie");



    }
}
