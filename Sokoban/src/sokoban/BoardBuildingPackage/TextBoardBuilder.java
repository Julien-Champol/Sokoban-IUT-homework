/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sokoban.BoardBuildingPackage;

import sokoban.ExceptionsPackage.BuilderExcpetion;

/**
 * Class representing data about the BoardBuilder using text files.
 *
 * @author jcdru
 */
public class TextBoardBuilder implements BoardBuilder {

    public Board build() throws BuilderExcpetion {
        Board pasDerreur = new Board("pasDerreur", 0, 0);
        return pasDerreur;
    }
}
