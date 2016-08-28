/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imagens;

/**
 *
 * @author Adilson
 */

// represent computer images
public class Image {
    int height; // pixels
    int width; // pixels
    String source; // file name
    String quality; // informal

    public Image(int height , int width) {
        this.height = height;
        this.width = width;
    }
}



