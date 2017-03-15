/*
    CLASE Fruta
    
    PROPIEDADES
        BASICAS
            posicionY  : tipo entero   : consultable
            posicionX  : tipo entero   : consultable
            bitMap     : tipo BitMap   : consultable 

        DERIVADAS
            NINGUNA

        COMPARTIDAS
            NINGUNA

    RESTRICCIONES
        posicionY  debe estar comprendida en un rango de entre 0 y 64
        posicionX  debe estar comprendida en un rango de entre 0 y 64

    INTERFAZ
        //METODOS CONSULTORES
	        public int getPosicionY()
	        public int getPosicionX() 
	        public BitMap getBitMap() 

        //METODOS MODIFICADORES
            public void setPosicionY(int posicionY) 
	        public void setPosicionX(int posicionX) 
	        public void setBitMap(BitMap myBitMap)
            
        //METODOS HEREDADOS
            public String toString()
            public int hashCode()
            public Fruta clone()
            public boolean equals(Object object)
            public int compareTo(Fruta Fruta)
        
        //METODOS AÑADIDOS
*/
public class Fruta
{
	//------------------------------- PROPIEDADES -----------------------------------------------//
		//BASICAS
		private int posicionY;
		private int posicionX;
		private Bitmap bitmap;

		//DERIVADAS
			//NINGUNA

		//COMPARTIDAS
			//NINGUNA

	//------------------------------- FIN PROPIEDADES --------------------------------------------//
		
	//------------------------------- CONSTRUCTORES ----------------------------------------------//
	//CONSTRUCTOR POR DEFECTO
	public Fruta()
	{
		posicionY  = 0;
		posicionX  = 0;
	}

	//CONSTRUCTOR SOBRECARGADO
	public Fruta(int posicionY, int posicionX, Bitmap bitmap)
	{
		this.posicionY  = posicionY;
		this.posicionX  = posicionX;
		this.bitmap = bitmap;
	}
	//CONSTRUCTOR DE COPIA
	//CONSTRUCTOR SOBRECARGADO
	public Fruta(Fruta fruta)
	{
		posicionY  = fruta.getPosicionY();
		posicionX  = fruta.getPosicionX();
		bitmap     = fruta.getBitmap();
	}
	//------------------------------- FIN CONSTRUCTORES ------------------------------------------//

	//------------------------------- METODOS CONSULTORES ----------------------------------------//
	public int getPosicionY() 
	{
		return posicionY;
	}
	public int getPosicionX() 
	{
		return posicionX;
	}
	public Bitmap getBitmap() 
	{
		return bitmap;
	}
	//------------------------------- FIN METODOS CONSULTORES ------------------------------------//

	//------------------------------- METODOS MODIFICADORES --------------------------------------//
	private void setPosicionY(int posicionY) 
	{
		this.posicionY = posicionY;
	}
	private void setPosicionX(int posicionX) 
	{
		this.posicionX = posicionX;
	}
	private void setBitMap(Bitmap bitmap)
	{
		this.bitmap = bitmap;
	}
	//------------------------------- FIN METODOS MODIFICADORES ----------------------------------//   

	//------------------------------- METODOS HEREDADOS ------------------------------------------// 
	//------------------------------- FIN METODOS HEREDADOS --------------------------------------// 
	 
	//------------------------------- METODOS AÑADIDOS -------------------------------------------//
	public void setPosicionYX(int posicionY, int posicionX)
	{
		this.posicionY = posicionY;
		this.posicionX = posicionX;
	}
	//------------------------------- FIN METODOS AÑADIDOS ---------------------------------------// 
}
