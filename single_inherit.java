class Box
{
	double w,h,d;
	Box()
	{
		w=0.0;
		h=0.0;
		d=0.0;
	}
	Box(double wid,double hig,double dep)
	{
		w=wid;
		h=hig;
		d=dep;
	}
	double volume()
	{
		return w*h*d ;
	}
}
class BoxWeight extends Box{
	double wt;
	
	BoxWeight(double wid,double hig,double dep, double weg )
	{
		w=wid;
		h=hig;
		d=dep;
		wt=weg;
	}	
}
class single_inherit
{
	public static void main(String[] args)
	{
		Box sup=new Box();
		BoxWeight sub= new BoxWeight(12,13,14,15);
		System.out.println("Box  width,height,depth :"+sup.w+" "+sup.h+" "+sup.d);
		System.out.println();
		System.out.println("Box 2 width ,height, dep, weight : "+sub.w+" "+sub.h+" "+sub.d+" "+sub.wt);
		double vol;
		vol=sub.volume();
		System.out.println("Volume Box 2   :"+ vol);
		
	}
}
