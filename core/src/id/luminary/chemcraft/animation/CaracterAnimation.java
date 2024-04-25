package id.luminary.chemcraft.animation;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class CaracterAnimation {
    private static final int FRAME_COLS = 7, FRAME_ROWS = 2, WALK_COLS = 6;
    public static Animation<TextureRegion> walkAnimation;
    public static Animation<TextureRegion> idleAnimation;
    private final static Texture walkSheet = new Texture(Gdx.files.internal("forager sprites.png"));
    private final static TextureRegion[][] tmp = TextureRegion.split(walkSheet,
            walkSheet.getWidth() / FRAME_COLS,
            walkSheet.getHeight() / FRAME_ROWS);

    static void idleinit() {
        TextureRegion[] idleFrames = new TextureRegion[FRAME_COLS];
        int index = 0;
        for (int j = 0; j < WALK_COLS; j++) {
            idleFrames[index++] = tmp[1][j];
        }
        idleAnimation = new Animation<>(0.08f, idleFrames);
    }
    static void walkinit(){
        TextureRegion[] walkFrames = new TextureRegion[WALK_COLS];
        int index = 0;
            for (int j = 0; j < WALK_COLS; j++) {
                walkFrames[index++] = tmp[1][j];
            }
        walkAnimation = new Animation<>(0.08f, walkFrames);
    }

    public static void init() {
       walkinit();
       idleinit();
    }
}
