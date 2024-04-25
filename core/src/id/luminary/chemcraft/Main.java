package id.luminary.chemcraft;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGenerator;
import com.badlogic.gdx.utils.ScreenUtils;
import id.luminary.chemcraft.animation.CaracterAnimation;
import id.luminary.chemcraft.utils.input;

public class Main extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img;
	BitmapFont font12;
    float stateTime;
	@Override
	public void create () {
		CaracterAnimation.init();
		FreeTypeFontGenerator fontGenerator = new FreeTypeFontGenerator(Gdx.files.internal("joystix monospace.ttf"));
		FreeTypeFontGenerator.FreeTypeFontParameter parameter = new FreeTypeFontGenerator.FreeTypeFontParameter();
		parameter.size = 32;
		font12 = fontGenerator.generateFont(parameter);
		fontGenerator.dispose();
		batch = new SpriteBatch();
		input.CheckAvailableDevice();
		input.SetDeviceType();
	}

	@SuppressWarnings("SuspiciousIndentation")
	@Override
	public void render () {
		super.render();
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        stateTime += Gdx.graphics.getDeltaTime();
		ScreenUtils.clear(0, 0, 0, 1);
		batch.begin();
		batch.draw(CaracterAnimation.walkAnimation.getKeyFrame(stateTime,true),0,0);
		font12.setColor(Color.BLUE);
		font12.draw(batch,"Hello Worldddddd", 200, 200);
		batch.end();
	}
	
	@Override
	public void dispose () {
		font12.dispose();
		batch.dispose();
		img.dispose();
	}
}
