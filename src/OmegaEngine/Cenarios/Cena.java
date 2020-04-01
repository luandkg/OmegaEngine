package OmegaEngine.Cenarios;

import java.awt.Graphics;

public abstract class Cena {

	private String mNome;

	private int mAltura;
	private int mLargura;

	public void setNome(String eNome, int eLargura, int eAltura) {
		this.mNome = eNome;

		mAltura = eAltura;
		mLargura = eLargura;

	}

	// Propriedades Importantes

	public String getNome() {
		return mNome;
	}

	public int getLargura() {
		return mLargura;
	}

	public int getAltura() {
		return mAltura;
	}

	// Metodos Importantes

	public abstract void iniciar();

	public abstract void update(double dt);

	public abstract void draw(Graphics g);

}
