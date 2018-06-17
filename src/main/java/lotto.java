
public class lotto
{
private pascal pascal;

public lotto()
{
    pascal = new pascal(100);
}

public long getChance(int a, int b)
{
    return pascal.getValue(a, b);
}


}
