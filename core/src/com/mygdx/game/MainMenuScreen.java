package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;

/**
 * Created by ruslan on 7/26/17.
 */

public class MainMenuScreen implements Screen {
    private final Launch mLaunch;
    private OrthographicCamera mOrthographicCamera;

    public MainMenuScreen(Launch mLaunch) {
        this.mLaunch = mLaunch;
        mOrthographicCamera = new OrthographicCamera();
        mOrthographicCamera.setToOrtho(false, 800, 600);
    }

    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(0, 0.2f, 0.5f, 0);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        mOrthographicCamera.update();
        mLaunch.mSpriteBatch.begin();
        mLaunch.mBitmapFont.draw(mLaunch.mSpriteBatch, "First sentence", 100, 150);
        mLaunch.mBitmapFont.setColor(Color.CORAL);
        mLaunch.mBitmapFont.draw(mLaunch.mSpriteBatch, "Second", 100,100);
        mLaunch.mSpriteBatch.end();

        if(Gdx.input.isTouched())
        {
            mLaunch.setScreen(new GameScreen(mLaunch));
            dispose();
        }

    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {

    }
}
