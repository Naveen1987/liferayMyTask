create table FOO_DocumentInfo (
	DocID LONG not null primary key,
	DocName VARCHAR(75) null,
	DocGen VARCHAR(75) null,
	DocFee INTEGER,
	DocSize VARCHAR(75) null,
	DocPreUrl VARCHAR(75) null,
	DocDownUrl VARCHAR(75) null
);