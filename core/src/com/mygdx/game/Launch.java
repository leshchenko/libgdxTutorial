package com.mygdx.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

/**
 * Created by ruslan on 7/26/17.
 */

public class Launch extends Game {
    SpriteBatch mSpriteBatch;
    BitmapFont mBitmapFont;

    @Override
    public void create() {
        mSpriteBatch = new SpriteBatch();
        mBitmapFont = new BitmapFont();
        this.setScreen(new MainMenuScreen(this));
    }

    @Override
    public void render() {
        super.render();
    }

    @Override
    public void dispose() {
        super.dispose();
        mSpriteBatch.dispose();
        mBitmapFont.dispose();
    }
}
