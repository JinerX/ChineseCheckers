//package org.server;
//
//import org.junit.jupiter.api.Test;
//import org.server.board.Cell;
//import org.server.board.PlayerZoneFactory;
//
//import static org.junit.jupiter.api.Assertions.*;
//
///**
// * Unit tests for the PlayerZoneFactory class to verify the creation and placement of player zones on the board.
// */
//class PlayerZoneFactoryTest {
//
//  /**
//   * Tests the addition of player zones to the board.
//   */
//  @Test
//  void testAddPlayerZones() {
//    int numOfPlayers = 3;
//    int boardWidth = 25;
//    int boardHeight = 17;
//    int playerZoneHeight = 4;
//
//    PlayerZoneFactory factory = new PlayerZoneFactory(numOfPlayers, boardWidth, boardHeight, playerZoneHeight);
//    Cell[][] board = new Cell[boardHeight][boardWidth];
//
//    // Initialize board with empty cells
//    for (int i = 0; i < boardHeight; i++) {
//      for (int j = 0; j < boardWidth; j++) {
//        board[i][j] = new Cell(i, j);
//      }
//    }
//
//    Cell[][] updatedBoard = factory.addPlayerZones(board);
//    assertNotNull(updatedBoard, "Updated board should not be null");
//
//    // Check that player zones were added
//    int playerZonesCount = 0;
//    for (int i = 0; i < boardHeight; i++) {
//      for (int j = 0; j < boardWidth; j++) {
//        if (updatedBoard[i][j].getZoneNum() > 0) {
//          playerZonesCount++;
//        }
//      }
//    }
//
//    assertTrue(playerZonesCount > 0, "Player zones should be added to the board");
//  }
//
//}
