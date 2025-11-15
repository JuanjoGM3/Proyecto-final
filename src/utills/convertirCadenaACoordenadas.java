package utills;

public class convertirCadenaACoordenadas {
	
	public static double[] convertirCadenaACoordenadas(String coordenadaStr){
        String[] partes = coordenadaStr.trim().split("\\s*,\\s*");

        if (partes.length != 2) {
            return null;
        }
        
        double latitud = Double.parseDouble(partes[0].trim());
        double longitud = Double.parseDouble(partes[1].trim());

        return new double[]{latitud, longitud};
    }
}
