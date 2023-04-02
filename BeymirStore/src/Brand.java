import java.util.*;

public class Brand
{
    private String name;
    private static int nextId=1;
    private  int id;

    public static List<Brand> ourBrands =new ArrayList<>();

    public Brand (String name)
    {
        this.name=name;
        this.id=nextId;
        if (nextId>9)
            ourBrands.add(this);
        nextId++;

        ourBrands.sort(Comparator.comparing(Brand::getName));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public  int getId() {
        return id;
    }

    public  void setId(int id) {
        this.id = id;
    }

    static
    {
        ourBrands.add(new Brand("Samsung"));
        ourBrands.add(new Brand("Lenovo"));
        ourBrands.add(new Brand("Apple"));
        ourBrands.add(new Brand("Huawei"));
        ourBrands.add(new Brand("Casper"));
        ourBrands.add(new Brand("Asus"));
        ourBrands.add(new Brand("HP"));
        ourBrands.add(new Brand("Xiomi"));
        ourBrands.add(new Brand("Monster"));
        ourBrands.sort(Comparator.comparing(Brand::getName));

    }
}
