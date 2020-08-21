package com.lvov;

public class Currency {
    private String name;
    public Currency(String name)
    {
        this.name = name;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }

    public int hashCode()
    {
        return name.hashCode();
    }
}
