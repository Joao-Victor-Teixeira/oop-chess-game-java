package application;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import chess.ChessException;
import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPosition;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        ChessMatch chessMatch = new ChessMatch();
        List<ChessPiece> captured = new ArrayList<>();

        while (!chessMatch.getCheckMate()) {
                  
            try{
                UI.clearScreen();
                UI.printMatch(chessMatch, captured);
                System.out.println();
                System.out.print("Origem: ");
                ChessPosition source = UI.readChessPosition(sc);

                boolean[][] possibleMoves = chessMatch.possibleMoves(source);
                UI.clearScreen();
                UI.printBoard(chessMatch.getpieces(), possibleMoves);

    
                System.out.println();
                System.out.print("Destino: ");
                ChessPosition target = UI.readChessPosition(sc);

                ChessPiece capturedPiece = chessMatch.perfotmChessMove(source, target);
                // Só adiciona à lista de capturadas se realmente houve uma peça capturada(Quase uma hora pra achar esse erro)
                if (capturedPiece != null) {
                    captured.add(capturedPiece);
                }

                if (chessMatch.getPromoted() != null) {
                    System.out.print("Digite a peça para ser promovida (B/N/R/Q): ");
                    String type = sc.nextLine().toUpperCase();
                   while (!type.equals("B") && !type.equals("N") && !type.equals("R") && !type.equals("Q")){
                        System.out.print("Letra inválida! Digite a peça para ser promovida (B/N/R/Q): ");
                        type = sc.nextLine().toUpperCase();
                   }
                chessMatch.replacePromotedPiece(type);
                }
            }
            catch (ChessException e){
                System.out.println(e.getMessage());
                sc.nextLine();
            }
             catch (InputMismatchException e){
                System.out.println(e.getMessage());
                sc.nextLine();
            }        
        } 
        UI.clearScreen();
        UI.printMatch(chessMatch, captured);
    }
}
