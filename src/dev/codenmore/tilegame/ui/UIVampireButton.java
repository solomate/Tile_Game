package dev.codenmore.tilegame.ui;

import dev.codenmore.tilegame.display.Display;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class UIVampireButton extends UIObject{
     private Display display;
    private BufferedImage[] images;
    private ClickListner clicker;
    
    public UIVampireButton(float x, float y, int width, int height,BufferedImage[] images, ClickListner clicker) {
        super(x, y, width, height);
        this.images = images;
        this.clicker = clicker;
    }
    
    @Override
    public void tick() {
        
    }

    @Override
    public void render(Graphics g) {
        
        if(hovering)
            g.drawImage(images[1],(int) x,(int) y,width,height,null);
        else
            g.drawImage(images[0],(int) x,(int) y,width,height,null);
    }

    @Override
    public void onClick() {
        clicker.onClick();
    }
}
