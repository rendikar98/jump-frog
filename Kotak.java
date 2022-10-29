
/**
 * Write a description of class Board here.
 *
 * @author Rendika Rahmaturrizki
 * @version 2.0
 */
public class Kotak
{
    // instance variables - replace the example below with your own
    private Koin coin;
    private Monster monsta;
    private boolean cstate;
    private boolean mstate;

    /**
     * Constructor for objects of class Board
     */
    public Kotak()
    {
        // initialise instance variables
       coin = null;
       monsta = null;
    }

    public void addKoin(Koin c)
    {
        coin = c;
    }

    public void addMonster(Monster m)
    {
        monsta = m;
    }

    public Koin getKoin()
    {
        return coin;
    }

    public Monster getMonster()
    {
        return monsta;
    }
    
    public boolean isThereKoin()
    {
        
        if (coin == null) 
        {
            cstate = false;
        } else
        {
            cstate = true;
        }
        return cstate;
    }

    public boolean isThereMonster()
    {
        if (monsta == null)
        {
            mstate = false;
        } else
        {
            mstate = true;
        }
        return mstate;
    }
}
