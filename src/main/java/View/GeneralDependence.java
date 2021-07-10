package View;

import Model.*;

public class GeneralDependence {

    private final DBConnector connector = new DBConnector();
    private final DBWorker DBWorker = new DBWorker(connector);
    private final ListIndex listIndex = new ListIndex();
    private final ResultCounter resultCounter = new ResultCounter(DBWorker, listIndex);
    private final FileWorker fileWorker = new FileWorker();
    private final JSONWorker jsonWorker = new JSONWorker(resultCounter, DBWorker);

    public FileWorker getFileWorker() { return fileWorker; }

    public ResultCounter getCountingResult() { return resultCounter; }

    public JSONWorker getJsonWorker() { return jsonWorker; }

    public DBWorker getDBWorker() { return DBWorker; }

    public ListIndex getListIndex() { return listIndex; }
}