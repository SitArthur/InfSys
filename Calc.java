package pack;
public class Calc {
	static double double_100km, double_distance,double_price_1l, double_probeg_do, double_probeg_next, double_volume,
	double_fuel,double_pass_dist, double_sred_100km, double_n_l, double_price,double_dist;
	public static void Dan_dist() {
		if (Distance.CB_100km==0){
			double_100km = Double.parseDouble(Distance.TextField_100km.getText());
		}
		double_distance = Double.parseDouble(Distance.TextField_distance.getText());
		double_price_1l = Double.parseDouble(Distance.TextField_price.getText());
	}
	public static void Dan_dist_100km() {
		if (Distance100km.CB_how_1==1){
		double_probeg_do = Double.parseDouble(Distance100km.TextField_probeg_do.getText());
		double_probeg_next = Double.parseDouble(Distance100km.TextField_probeg_next.getText());
		double_volume = Double.parseDouble(Distance100km.TextField_volume.getText());
		} else {
		double_fuel = Double.parseDouble(Distance100km.TextField_fuel.getText());
		double_pass_dist = Double.parseDouble(Distance100km.TextField_pass_dist.getText());  
		}
	}
	public static void Calcul_distance() {
	    if (Distance.CB_100km==0){ 
	    	double_sred_100km=double_100km;
	    } else {
	    	double_sred_100km=Calcul_100km();
	    }
	    double_n_l=double_distance * (double_sred_100km/100);
	    double_price=double_price_1l * double_n_l;
	    String String_sred_100km_1 = String.format("%.2f", double_sred_100km);
	    String String_distance = String.format("%.2f", double_distance);
	    String String_n_l = String.format("%.2f", double_n_l);
	    String String_price = String.format("%.2f", double_price);
	    Calc_distance.Label_100km.setText(String_sred_100km_1);
	    Calc_distance.Label_n_km.setText(String_distance);
	    Calc_distance.Label_n_l.setText(String_n_l);
	    Calc_distance.Label_price.setText(String_price);
	}
	public static void Calcul_distance_100km() {
		double_sred_100km = Calcul_100km(); 
		if (Distance100km.CB_how_1==1){
			double_dist=double_probeg_next-double_probeg_do;
		} else {
			double_dist=double_pass_dist;
		}
	    String string_dist = String.format("%.2f", double_dist);
	    String string_sred_100km = String.format("%.2f", double_sred_100km);
	    String string_volume = String.format("%.2f", double_volume);
	    Calc_distance100km.Label_dist.setText(string_dist);
	    Calc_distance100km.Label_100km.setText(string_sred_100km);
	    Calc_distance100km.Label_fuel.setText(string_volume);
	}
	private static double Calcul_100km(){
		if (Distance100km.CB_how_1==1){
			double_sred_100km=double_volume/(double_probeg_next-double_probeg_do)*100;
		} else {
			double_sred_100km=double_fuel/double_pass_dist*100;
		}		
		return double_sred_100km;
	}
	}