/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lwjgltest;

import org.lwjgl.input.Keyboard;
import static org.lwjgl.opengl.GL11.*;

/**
 *
 * @author Elliott
 */
public class game {
    public game(){
        
    }
    
    
    
    public void user_input(){
        if(Keyboard.isKeyDown(Keyboard.KEY_UP)){
            
        }
    }
    
    public void update(){
        
    }
    
    public void render(){
        
    }
    
    public void draw_rect(float x, float y, float width, float height){
        glPushMatrix();
        
        glBegin(GL_QUADS);{
        glVertex2f(x,y);
        glVertex2f(x+width,y);
        glVertex2f(x+width,y+height);
        glVertex2f(x,y+height);
    }
        glEnd();
        
        
        glPopMatrix();
    }
}
