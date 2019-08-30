all:
	pandoc README.md --template=template.xml -t html -o pandocker-live-templates/META-INF/output.xml
	zip -r pandocker-live-templates.zip pandocker-live-templates/
#	zip -d pandocker-live-templates.zip "*/.DS_Store"
