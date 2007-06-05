package edu.byu.cs.adbcj.mysql;

enum Command {
	SLEEP,
	QUIT,
	INIT_DB,
	QUERY,
	FIELD_LIST,
	CREATE_DB,
	DROP_DB,
	REFRESH,
	SHUTDOWN,
	STATISTICS,
	PROCESS_INFO,
	CONNECT,
	PROCESS_KILL,
	DEBUG,
	PING,
	TIME,
	DELAYED_INSERT,
	CHANGED_USER,
	BINLOG_DUMP,
	TABLE_DUMP,
	CONNECT_OUT,
	REGISTER_SLAVE,
	STATEMENT_PREPARE,
	STATEMENT_EXECUTE,
	STATEMENT_SEND_LONG_DATA,
	STATEMENT_CLOSE,
	STATEMENT_RESET,
	SET_OPTION,
	STATEMENT_FETCH
}