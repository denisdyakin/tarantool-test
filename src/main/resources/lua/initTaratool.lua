box.cfg{listen=3301}
space = box.schema.space.create('tester')
box.space.tester:create_index('primary', {type = 'tree', parts = {1, 'NUM'}})
box.schema.user.create('test', { password = 'test' })
box.schema.user.grant('test', 'execute,read,write', 'universe')