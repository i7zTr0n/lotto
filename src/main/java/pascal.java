
public class pascal
{
private long[] [] pascal = new long[1000][1000];
private int a, b, s;

public pascal(int _s)
{
    s = _s; //Wie viele Zeilen/Spalten berechnet werden
    for (int i = 0;i<s;i++)
    {
        spalteBerechnen(i);
    }
}

public void spalteBerechnen(int n)
{
    if (n == 0)
    {
        for (int i = 0;i<s;i++)
        {
            pascal [n] [i] = 1;
        }
    }
    else
    {
        for (int i = 0+n;i<s;i++)
        {
            pascal [n] [i] = pascal [n-1] [i-1] + pascal [n] [i - 1];
        }
    }
}

public void printPascal()
{
    for (int n = 0;n<s;n++)
    {
        for (int i = 0; i < s; i++)
        {
            System.out.print(pascal [i] [n]+" ");
        }
        System.out.print("\n");
    }
}

public long getValue(int a, int b)
{
    return pascal [a] [b];
}


}
