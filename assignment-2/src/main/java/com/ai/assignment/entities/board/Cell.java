package com.ai.assignment.entities.board;


import com.ai.assignment.entities.PlayerType;


/**
 * @author deepakjha on 10/13/19
 * @project ai-assignments
 */
public class Cell {
    private int row;
    private int col;
    private PlayerType playerType;

    private int distance;


    public Cell(final int row, final int col, final PlayerType playerType) {
        this.row = row;
        this.col = col;
        this.playerType = playerType;
    }


    public int getRow() {
        return this.row;
    }


    public int getCol() {
        return this.col;
    }


    public PlayerType getPlayerType() {
        return this.playerType;
    }


    public void setDistance(int distance) {
        this.distance = distance;
    }


    public int getDistance() {
        return this.distance;
    }


    public Cell getLeft() {
        return Halma.getLeft(new Coordinates(this.getRow(), this.getCol()));
    }


    public Cell getRight() {
        return Halma.getRight(new Coordinates(this.getRow(), this.getCol()));
    }


    public Cell getTop() {
        return Halma.getTop(new Coordinates(this.getRow(), this.getCol()));
    }


    public Cell getBottom() {
        return Halma.getBottom(new Coordinates(this.getRow(), this.getCol()));
    }


    public Cell getTopLeft() {
        return Halma.getTopLeft(new Coordinates(this.getRow(), this.getCol()));
    }


    public Cell getTopRight() {
        return Halma.getTopRight(new Coordinates(this.getRow(), this.getCol()));
    }


    public Cell getBottomLeft() {
        return Halma.getBottomLeft(new Coordinates(this.getRow(), this.getCol()));
    }


    public Cell getBottomRight() {
        return Halma.getBottomRight(new Coordinates(this.getRow(), this.getCol()));
    }

}