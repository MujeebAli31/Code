package edu.monmouth.lab2;

public class State {
	private String name;
	private int coastLength;
	private String stateBird;
	
	public State(String name, int coastLength, String stateBird)
	{
		this.name=name;
		this.coastLength=coastLength;
		this.stateBird= stateBird;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public void setCoastLength(int coastLength)
	{
		this.coastLength=coastLength;
	}
	public void setStateBird(String stateBird)
	{
		this.stateBird=stateBird;
	}
	public String getName()
	{
		return this.name;
	}
	public int getCoastLength()
	{
		return this.coastLength;
	}
	public String getStateBird()
	{
		return this.stateBird;
	}
	@Override
	public boolean equals(Object o)
	{
		if(this==o)
		{
		return true;
		}
    if (o == null || getClass() != o.getClass()) {
        return false;
    }
    State state = (State) o;
    return coastLength == state.coastLength && name.equals(state.name) && stateBird.equals(state.stateBird);
	}
	@Override
	public int hashCode()
	{
		int result = name.hashCode();
		result = 31 * result + coastLength;
		result = 31 * result + stateBird.hashCode();
		return result;
	}
	@Override
	public String toString() {
		return "State [name=" + name + ", coastLength=" + coastLength + ", stateBird=" + stateBird + "]";
	}
	

}
