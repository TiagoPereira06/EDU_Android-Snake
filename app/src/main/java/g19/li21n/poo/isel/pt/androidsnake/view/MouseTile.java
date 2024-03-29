package g19.li21n.poo.isel.pt.androidsnake.view;

import android.graphics.Canvas;
import android.graphics.Paint;

import pt.isel.poo.tile.Img;

public class MouseTile extends CellTile {

    private final Img image;
    private final Paint brush;

    public MouseTile(Img image) {
        this.image = image;
        this.brush = new Paint();
    }


    @Override
    public void draw(Canvas canvas, int side) {
        image.draw(canvas,side,side,brush);
    }

    @Override
    public boolean setSelect(boolean selected) {
        return false;
    }
}
