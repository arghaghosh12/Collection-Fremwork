package sortingobjects;

import java.util.Comparator;

class MobileCostComparator implements Comparator<Mobile> {
	@Override
	public int compare(Mobile x,Mobile y)
	{
		return x.cost-y.cost;
	}

}
