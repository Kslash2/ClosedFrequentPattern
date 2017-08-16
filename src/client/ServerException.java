package client;



public class ServerException extends RuntimeException implements Thread.UncaughtExceptionHandler{
    @Override
    public void uncaughtException(Thread arg0, Throwable arg1) {
    }
  }