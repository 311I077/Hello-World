/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lwjgltest;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.*;
import static org.lwjgl.opengl.GL11.*;

/**
 *
 * @author Elliott
 */
public class Lwjgltest {
    
    public static game game;
    public static void main(String[] args) {
        init_display();
        init_gl();
        init_game();
        game_loop();
        cleanup();
    }
    public static void init_display(){
        try {
            Display.setDisplayMode(new DisplayMode(500,500));
            Display.create();
            Display.setVSyncEnabled(true);
        } catch (LWJGLException ex) {
            Logger.getLogger(Lwjgltest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void init_gl(){
        glMatrixMode(GL_PROJECTION);
        glLoadIdentity();
        glOrtho(0,Display.getWidth(),0,Display.getHeight(),-1,1);
        glMatrixMode(GL_MODELVIEW);
        glClearColor(0,0,0,1);
        
    }
    
    public static void init_game(){
        game = new game();
    }
    
    public static void user_input(){
        game.user_input();
    }
    
    public static void update(){
        game.update();
    }
    
    public static void render(){
        
        glClear(GL_COLOR_BUFFER_BIT);
        glLoadIdentity();
        game.render();
        Display.update();
        Display.sync(60);
        
    }
    
    public static void game_loop(){
        while(!Display.isCloseRequested()){
            user_input();
            update();
            render();
        }
    }
    
    public static void cleanup(){
        Display.destroy();
    }
    
}
