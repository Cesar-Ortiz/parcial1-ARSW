package eci.arsw.covidanalyzer;

import java.io.File;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Hilo extends Thread{
	private List<File> resultFiles;
	private AtomicInteger amountOfFilesProcessed;
	private ResultAnalyzer resultAnalyzer;
	private TestReader testReader;
	private boolean parar;
	
	public Hilo(List<File> resultFiles, TestReader testReader,ResultAnalyzer resultAnalyzer, AtomicInteger amountOfFilesProcessed) {
		this.resultFiles=resultFiles;
		this.amountOfFilesProcessed=amountOfFilesProcessed;
		this.resultAnalyzer=resultAnalyzer;
		this.testReader=testReader;
	}
	
	public void run() {
		for (File resultFile : resultFiles) {
            List<Result> results = testReader.readResultsFromFile(resultFile);
            for (Result result : results) {
                resultAnalyzer.addResult(result);
            }
            amountOfFilesProcessed.incrementAndGet();
        }
	}
	
	public boolean estaDetenido() {
		return parar;
	}

	public void setDetener(boolean enPausa) {
		this.parar = enPausa;
	}
}
