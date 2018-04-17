package cz.parser;

/**
 * Item - the command-line element
 *
 * @author Sergey Iryupin
 * @version 0.2.4 dated Apr 17, 2018
 */
public class Item<E> {
    private String name;
    private boolean mandatory;
    private String description;
    private String[] aliases;
    private Action action;
    private E byDefault;
    private E value;

    public Item(String name, boolean mandatory, String description,
                String[] aliases, Action action) {
        this.name = name;
        this.mandatory = mandatory;
        this.description = description;
        this.aliases = aliases;
        this.action = action;
    }

    public String getName() {
        return name;
    }

    public E getValue() {
        return value;
    }

    public boolean isAlias(String str) {
        for (String alias : aliases)
            if (str.equals(alias))
                return true;
        return false;
    }

    public void act(String[] args, int idx) {
        switch (action) {
            case GET:
                break;
            case CALCULATE:
                break;
            case PRINT:
                break;
        }
    }
}