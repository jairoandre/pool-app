updb: downdb
	@docker run -d \
		--mount source=pool,target=/var/lib/postgresql/data \
		--name pool \
		-e POSTGRES_USER=root \
		-e POSTGRES_PASSWORD=root \
		-e POSTGRES_DB=pool \
		-p 5432:5432 postgres:alpine

downdb:
	@docker rm -f pool 2>/dev/null || exit 0